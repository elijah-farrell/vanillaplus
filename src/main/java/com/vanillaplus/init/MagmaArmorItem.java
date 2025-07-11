package com.vanillaplus.init;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;

public class MagmaArmorItem extends ArmorItem {
    public MagmaArmorItem(ArmorMaterial material, Type type, Item.Properties properties) {
        super(material, type, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if (slot == EquipmentSlot.LEGS) {
            // Layer 2 (leggings) - animated with 3 frames, 8 ticks each
            int frameCount = 3; // 3 frames for magma animation
            int frame = (entity.tickCount / 8) % frameCount; // Change every 8 ticks (matches duration=8)
            return String.format("vanillaplus:textures/models/averagetateman/armors/magma/layer_2_frame%d.png", frame);
        } else {
            // Layer 1 (helmet, chestplate, boots) - animated with 3 frames, 8 ticks each
            int frameCount = 3; // 3 frames for magma animation
            int frame = (entity.tickCount / 8) % frameCount; // Change every 8 ticks (matches duration=8)
            return String.format("vanillaplus:textures/models/averagetateman/armors/magma/layer_1_frame%d.png", frame);
        }
    }
} 