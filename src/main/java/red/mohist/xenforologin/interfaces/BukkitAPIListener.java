package red.mohist.xenforologin.interfaces;

import org.bukkit.event.Listener;

public interface BukkitAPIListener extends Listener {

    void eventClass();

    default boolean isAvailable() {
        try {
            eventClass();
        } catch (NoClassDefFoundError e) {
            return false;
        }
        return true;
    }

}
