package org.destiny.client.messages.events;

import org.destiny.client.GameClient;
import org.destiny.client.Session;
import org.destiny.client.messages.MessageEvent;
import org.destiny.client.protocol.ClientMessage;
import org.destiny.client.protocol.ServerMessage;

public class AddFriendListEvent implements MessageEvent
{

	@Override
	public void parse(Session Session, ServerMessage Request, ClientMessage Message)
	{
		GameClient.getInstance().getHUD().getFriendsList().addFriend(Request.readString());
	}
}
