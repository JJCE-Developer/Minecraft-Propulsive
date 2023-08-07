package com.june.propulsive.celestial;

import com.june.propulsive.Propulsive;
import com.june.propulsive.types.Planet;
import com.june.propulsive.types.PlanetDimensions;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.List;

import static com.june.propulsive.Propulsive.SPACE;

public class Star extends Planet {
    public Star(double scale, double posX, double posY, double posZ, float orbitTime, float horizontalRotation, float verticalRotation, Identifier texture2d, Identifier texture3d, PlanetDimensions dimensions) {
        super(scale, posX, posY, posZ, orbitTime, horizontalRotation, verticalRotation, texture2d, texture3d, dimensions);
    }
    @Override
    public void collisionDetected(ServerPlayerEntity player) {
        player.damage(player.getWorld().getDamageSources().create(Propulsive.STAR_DAMAGE_TYPE), Float.MAX_VALUE);
    }
}
