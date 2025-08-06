package mods.voiceds;

import ext.mods.gameserver.handler.IVoicedCommandHandler;
import ext.mods.gameserver.model.actor.Player;

public class VoicedExemplo implements IVoicedCommandHandler
{
	
	private String[] _VoicedCommandExetra =
	{
		"exemplo",
	};
	
	@Override
	public String[] getVoicedCommandList()
	{
		return _VoicedCommandExetra;
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
	
}
