package com.vanillaplus.init;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;

public class BeeArmorItem extends ArmorItem {
    public BeeArmorItem(ArmorMaterial material, Type type, Item.Properties properties) {
        super(material, type, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if (slot == EquipmentSlot.LEGS) {
            // Layer 2 (leggings) - static, no animation
            return "vanillaplus:textures/models/averagetateman/armors/bee/layer_2.png";
        } else {
            // Layer 1 (helmet, chestplate, boots) - animated
            int frameCount = 3; // 3 frames for bee animation
            int frame = (entity.tickCount / 2) % frameCount; // Change every 2 ticks for fast buzzing
            return String.format("vanillaplus:textures/models/averagetateman/armors/bee/layer_1_frame%d.png", frame);
        }
    }
} 