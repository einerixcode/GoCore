import command.CoreCommands;
import io.gomint.ChatColor;
import io.gomint.plugin.Plugin;
import io.gomint.plugin.PluginName;
import io.gomint.plugin.Version;
import listener.LobbyListener;

@PluginName("Core")
@Version(major = 1, minor = 0)
public class Core extends Plugin
{
    /**
     * @author einerixcode
     * @version 0.1
     */

    @Override
    public void onStartup()
    {
        getLogger().info(ChatColor.RED + this.getName() + this.getVersion() + "wurde geladen");
    }

    @Override
    public void onInstall()
    {
        registerCommand(new CoreCommands());
        registerListener(new LobbyListener() );
    }
}
