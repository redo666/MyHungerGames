package com.randude14.hungergames.commands;

import com.randude14.hungergames.Defaults.Commands;
import com.randude14.hungergames.GameManager;
import com.randude14.hungergames.HungerGames;
import com.randude14.hungergames.utils.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AddItemSetCommand extends SubCommand {

	public AddItemSetCommand() {
		super(Commands.ADMIN_ADD_ITEMSET);
	}

	@Override
	public boolean handle(CommandSender cs, Command cmd, String[] args) {	    
	    Player player = (Player) cs;
	    if(args.length < 2){
		    ChatUtils.helpCommand(player, command.getUsage(), HungerGames.CMD_ADMIN);
	    }
	    game = GameManager.getGame(args[0]);
	    
	    if (game == null) {
		    ChatUtils.sendDoesNotExist(player, args[0]);
		    return true;
	    }
	    game.addItemSet(args[1]);
	    return true;
	}
	
}