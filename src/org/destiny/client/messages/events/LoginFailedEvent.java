package org.destiny.client.messages.events;

import org.destiny.client.GameClient;
import org.destiny.client.Session;
import org.destiny.client.messages.MessageEvent;
import org.destiny.client.protocol.ClientMessage;
import org.destiny.client.protocol.ServerMessage;

public class LoginFailedEvent implements MessageEvent
{

	@Override
	public void parse(Session Session, ServerMessage Request, ClientMessage Message)
	{
		GameClient.getInstance().getGUI().invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				GameClient.getInstance().showMessageDialog("Login failed, please try again!");
				GameClient.getInstance().getGUIPane().hideLoadingScreen();
				GameClient.getInstance().getLoginScreen().enableLogin();
			}
		});
	}
}
