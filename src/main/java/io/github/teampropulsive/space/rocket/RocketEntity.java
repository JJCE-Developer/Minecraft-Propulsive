package io.github.teampropulsive.space.rocket;

import io.github.teampropulsive.screen.MapScreen;
import io.github.teampropulsive.space.spacecraft.SpacecraftEntity;
import io.github.teampropulsive.types.Planet;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import org.joml.Vector3f;
import qouteall.q_misc_util.my_util.Vec2d;

import static io.github.teampropulsive.Propulsive.SPACE;
import static io.github.teampropulsive.Propulsive.TICKABLE_PLANETS;
import static io.github.teampropulsive.keybind.DockShipKeybind.dockShipKey;

public class RocketEntity extends SpacecraftEntity {
    public boolean hasWarpAbility = false;

    public RocketEntity(EntityType<? extends SpacecraftEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean canJump() {
        return hasWarpAbility;
    }

    @Override
    protected void jump(float strength, Vec3d movementInput) {
        //super.jump(strength, movementInput);
    }

    @Override
    protected Vec3d getControlledMovementInput(PlayerEntity controllingPlayer, Vec3d movementInput) {
        Vec3d a = controllingPlayer.getRotationVecClient();

        float x = 0.0f;//(float) a.x;
        float y = 0.0f;//(float) a.y;
        float z = 0.0f;//(float) a.z;
        return new Vec3d(x, y, z);
    }


    @Override
    protected float getSaddledSpeed(PlayerEntity controllingPlayer) {
        return (float)this.getAttributeValue(EntityAttributes.GENERIC_MOVEMENT_SPEED);
    }
}