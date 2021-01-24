package cx.mia.elytra.discord.api.entity;

import org.javacord.api.entity.permission.Role;

public class ERole {

    public Role dRole;

    public ERole(Role role) {
        this.dRole = role;
    }

    public static boolean isWhitelistRole(ERole eRole) {
        return false;
    }
}
