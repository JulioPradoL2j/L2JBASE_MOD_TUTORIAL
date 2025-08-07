package mods.voiceds;

import ext.mods.extensions.interfaces.L2JExtension;
import ext.mods.gameserver.handler.IVoicedCommandHandler;
import ext.mods.gameserver.handler.VoicedCommandHandler;
import ext.mods.gameserver.model.actor.Player;

public class VoicedExemplo implements L2JExtension, IVoicedCommandHandler
{
	
	private String[] _command =
	{
		"exemplo"
	};
	
	@Override
	public String[] getVoicedCommandList()
	{
		return _command;
	}
	
	@Override
	public boolean useVoicedCommand(String command, Player player, String extra)
	{
		if(command.startsWith("exemplo"))
		{
			player.sendMessage("Comando extra funcional.");
		}
		return false;
	}

	
	@Override
	public String getName()
	{
		
		return "Voiced Command Teste";
	}

	@Override
	public void onDisable()
	{
		
		
	}
	
	@Override
	public void onLoad()
	{
		VoicedCommandHandler.getInstance().registerHandler(new VoicedExemplo());
	}
	
}
