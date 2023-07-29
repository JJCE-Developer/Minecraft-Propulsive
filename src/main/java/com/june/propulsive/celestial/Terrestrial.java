package com.june.propulsive.celestial;

import com.june.propulsive.types.Planet;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.List;

import static com.june.propulsive.Propulsive.SPACE;

public class Terrestrial extends Planet {
    public Terrestrial(double scale, double posX, double posY, double posZ, float horizontalRotation, float verticalRotation, Identifier texture2d, Identifier texture3d) {
        super(scale, posX, posY, posZ, horizontalRotation, verticalRotation, texture2d, texture3d);
    }

    @Override
    public void collisionDetected(ServerPlayerEntity player) {

    }
}
