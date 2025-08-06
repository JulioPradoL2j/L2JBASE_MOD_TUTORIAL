package mods.bypass;

import ext.mods.extensions.interfaces.L2JExtension;
import ext.mods.extensions.listener.command.OnBypassCommandListener;
import ext.mods.extensions.listener.manager.BypassCommandManager;
import ext.mods.gameserver.model.actor.Player;

public class CustomBypassExtension implements L2JExtension, OnBypassCommandListener
{
	@Override
	public void onLoad()
	{
		System.out.println("[CustomBypassExtension] Carregado.");
		BypassCommandManager.getInstance().registerBypassListener(this);
	}
	
	@Override
	public void onDisable()
	{
		System.out.println("[CustomBypassExtension] Descarregado.");
		BypassCommandManager.getInstance().unregisterBypassListener(this);
	}
	
	@Override
	public String getName()
	{
		return "CustomBypassExtension";
	}

	@Override
	public boolean onBypass(Player player, String command)
	{
		if (command.equalsIgnoreCase("custom_mycommand"))
		{
			player.sendMessage("Voce executou um comando customizado!");
			// ou exibir HTML, fazer ação, etc
			return true;
		}
		return false;
	}
}
