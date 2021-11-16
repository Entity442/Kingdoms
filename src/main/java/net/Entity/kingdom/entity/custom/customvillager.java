package net.Entity.kingdom.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class customVillager extends Animal {


    public customVillager(EntityType<? extends Animal> p_27557_, Level level) {
        super(p_27557_, level);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }
}
