package mods;

import ext.mods.extensions.interfaces.L2JExtension;
import ext.mods.gameserver.handler.VoicedCommandHandler;
import mods.voiceds.VoicedExemplo;

public class main implements L2JExtension
{
	
	@Override
	public String getName()
	{
		return "main";
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
