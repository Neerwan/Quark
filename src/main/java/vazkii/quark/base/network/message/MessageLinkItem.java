/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [06/06/2016, 01:50:55 (GMT)]
 */
package vazkii.quark.base.network.message;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import vazkii.quark.base.network.Message;
import vazkii.quark.management.feature.FToSwitchItems;
import vazkii.quark.management.feature.LinkItems;

public class MessageLinkItem  extends Message {

	public int index;

	public MessageLinkItem() { }

	public MessageLinkItem(int index) {
		this.index = index;
	}

	@Override
	public IMessage handleMessage(MessageContext context) {
		LinkItems.linkItem(context.getServerHandler().playerEntity, index);
		return null;
	}

}
