package cx.mia.elytra.discord.api.entity;

import org.javacord.api.entity.user.User;
import org.javacord.api.event.server.role.UserRoleAddEvent;
import org.javacord.api.event.server.role.UserRoleRemoveEvent;
import org.javacord.api.listener.server.role.UserRoleAddListener;
import org.javacord.api.listener.server.role.UserRoleRemoveListener;

import java.util.UUID;

/* TODO EUser
- linked uuid
- link()
- whitelist()
 */

/**
 * Elytra's way of keeping track which discord user belongs to which minecraft player and vice versa
 * @author miacx
 */
public class EUser {

    /**
     * the discord user that belongs to this EUser
     */
    public User dUser;

    /**
     * the UUID of the minecraft player that belongs to EUser
     */
    private UUID linkedUuid;

    public EUser(User user) {
        this.dUser = user;
    }

    // TODO getLinkedUuid
    private UUID getLinkedUuid() {
        if (this.linkedUuid != null) return this.linkedUuid;
        else {
            // db lookup -> userId, uuid
            UUID uuid = UUID.fromString(result);
            this.linkedUuid = uuid;
            return this.linkedUuid;
        }
    }

    // TODO setLinkedUuid
    private void setLinkedUuid(UUID uuid) {
        this.linkedUuid = uuid;
        // db assign -> userId, uuid
    }

    // TODO remvoeLinkedUuid()

    /**
     *
     */
    private void removeLinkedUuid() {
        this.linkedUuid = null;
        // db remove -> userId
    }


    public void link(String username) {
        setLinkedUuid(uuid);

    }

    public void unLink() {
        removeLinkedUuid();
    }


    // TODO whitelist
    public void whitelist() {

    }

    public void unWhitelist() {

    }

}
