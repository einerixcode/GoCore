package command;

import io.gomint.ChatColor;
import io.gomint.command.Command;
import io.gomint.command.CommandOutput;
import io.gomint.command.CommandSender;
import io.gomint.command.annotation.Description;
import io.gomint.command.annotation.Name;
import io.gomint.entity.EntityPlayer;
import io.gomint.math.Vector;

import java.util.Map;

@Name( "lel" )
@Description( "Give custom velocity to player" )


public class CoreCommands extends Command
{
    /**
     * @author einerixcode
     * @version 0.1
     */
    @Override
    public CommandOutput execute(CommandSender commandSender, String s, Map<String, Object> map)
    {
        CommandOutput output = new CommandOutput();
        commandSender.sendMessage("Hallo");
        output.success(ChatColor.RED + "Velocity");

        return null;
    }
}
