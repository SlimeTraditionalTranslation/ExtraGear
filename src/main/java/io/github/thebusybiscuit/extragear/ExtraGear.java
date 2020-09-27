package io.github.thebusybiscuit.extragear;

import java.util.Arrays;
import java.util.List;

import org.bstats.bukkit.Metrics;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.collections.Pair;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public class ExtraGear extends JavaPlugin implements SlimefunAddon {

    private int researchId = 3300;
    private Category category;

    @Override
    public void onEnable() {

        new Metrics(this, 6469);

        category = new Category(new NamespacedKey(this, "items"), new CustomItem(Material.DIAMOND_SWORD, "&6更多裝備"), 1);

        registerSword(Material.IRON_SWORD, "COPPER", "銅", SlimefunItems.COPPER_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_UNDEAD, 2)));
        registerArmor(ArmorSet.LEATHER, "COPPER", "銅", SlimefunItems.COPPER_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 2)));

        registerSword(Material.IRON_SWORD, "TIN", "錫", SlimefunItems.TIN_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 1)));
        registerArmor(ArmorSet.IRON, "TIN", "錫", SlimefunItems.TIN_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 3)));

        registerSword(Material.IRON_SWORD, "SILVER", "銀", SlimefunItems.SILVER_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 2)));
        registerArmor(ArmorSet.IRON, "SILVER", "銀", SlimefunItems.SILVER_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 2)));

        registerSword(Material.IRON_SWORD, "ALUMINUM", "鋁", SlimefunItems.ALUMINUM_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 3)));
        registerArmor(ArmorSet.IRON, "ALUMINUM", "鋁", SlimefunItems.ALUMINUM_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_EXPLOSIONS, 2), new Pair<>(Enchantment.DURABILITY, 2)));

        registerSword(Material.IRON_SWORD, "LEAD", "鉛", SlimefunItems.LEAD_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 3), new Pair<>(Enchantment.DURABILITY, 8)));
        registerArmor(ArmorSet.IRON, "LEAD", "鉛", SlimefunItems.LEAD_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3), new Pair<>(Enchantment.DURABILITY, 8)));

        registerSword(Material.IRON_SWORD, "ZINC", "鋅", SlimefunItems.ZINC_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 2)));
        registerArmor(ArmorSet.IRON, "ZINC", "鋅", SlimefunItems.ZINC_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3)));

        registerSword(Material.IRON_SWORD, "MAGNESIUM", "鎂", SlimefunItems.MAGNESIUM_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 2), new Pair<>(Enchantment.DURABILITY, 5)));
        registerArmor(ArmorSet.IRON, "MAGNESIUM", "鎂", SlimefunItems.MAGNESIUM_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 2), new Pair<>(Enchantment.DURABILITY, 5)));

        registerSword(Material.IRON_SWORD, "STEEL", "鋼", SlimefunItems.STEEL_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 5), new Pair<>(Enchantment.DURABILITY, 6)));
        registerArmor(ArmorSet.IRON, "STEEL", "鋼", SlimefunItems.STEEL_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 3), new Pair<>(Enchantment.DURABILITY, 4)));

        registerSword(Material.IRON_SWORD, "BRONZE", "青銅", SlimefunItems.BRONZE_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 3), new Pair<>(Enchantment.DURABILITY, 6)));
        registerSword(Material.IRON_SWORD, "DURALUMIN", "硬鋁", SlimefunItems.DURALUMIN_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 3), new Pair<>(Enchantment.DURABILITY, 6)));
        registerSword(Material.IRON_SWORD, "BILLON", "銀銅合金", SlimefunItems.BILLON_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 4), new Pair<>(Enchantment.DURABILITY, 5)));
        registerSword(Material.IRON_SWORD, "BRASS", "黃銅", SlimefunItems.BRASS_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_UNDEAD, 4), new Pair<>(Enchantment.DURABILITY, 6)));
        registerSword(Material.IRON_SWORD, "ALUMINUM_BRASS", "鋁黃銅", SlimefunItems.ALUMINUM_BRASS_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 4), new Pair<>(Enchantment.DURABILITY, 4)));
        registerSword(Material.IRON_SWORD, "ALUMINUM_BRONZE", "鋁青銅", SlimefunItems.ALUMINUM_BRONZE_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 4), new Pair<>(Enchantment.DURABILITY, 5)));
        registerSword(Material.IRON_SWORD, "CORINTHIAN_BRONZE", "科林斯青銅", SlimefunItems.CORINTHIAN_BRONZE_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 5), new Pair<>(Enchantment.DURABILITY, 5)));
        registerSword(Material.IRON_SWORD, "SOLDER", "焊錫", SlimefunItems.SOLDER_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 4), new Pair<>(Enchantment.DURABILITY, 6)));
        registerSword(Material.IRON_SWORD, "DAMASCUS_STEEL", "大馬士革鋼", SlimefunItems.DAMASCUS_STEEL_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 6), new Pair<>(Enchantment.DURABILITY, 7)));
        registerSword(Material.IRON_SWORD, "HARDENED", "硬化金屬", SlimefunItems.HARDENED_METAL_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 7), new Pair<>(Enchantment.DURABILITY, 10)));
        registerSword(Material.IRON_SWORD, "REINFORCED", "強化合金", SlimefunItems.REINFORCED_ALLOY_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 8), new Pair<>(Enchantment.DURABILITY, 8)));
        registerSword(Material.IRON_SWORD, "FERROSILICON", "矽鐵", SlimefunItems.FERROSILICON, Arrays.asList(new Pair<>(Enchantment.DAMAGE_UNDEAD, 8), new Pair<>(Enchantment.DURABILITY, 4)));
        registerSword(Material.GOLDEN_SWORD, "GILDED_IRON", "鍍金鐵", SlimefunItems.GILDED_IRON, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ARTHROPODS, 8), new Pair<>(Enchantment.DURABILITY, 10)));
        registerSword(Material.IRON_SWORD, "NICKEL", "鎳", SlimefunItems.NICKEL_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 6), new Pair<>(Enchantment.DURABILITY, 5)));

        registerSword(Material.IRON_SWORD, "COBALT", "鈷", SlimefunItems.COBALT_INGOT, Arrays.asList(new Pair<>(Enchantment.DAMAGE_ALL, 7), new Pair<>(Enchantment.DURABILITY, 7)));
        registerArmor(ArmorSet.IRON, "COBALT", "鈷", SlimefunItems.COBALT_INGOT, Arrays.asList(new Pair<>(Enchantment.PROTECTION_ENVIRONMENTAL, 7), new Pair<>(Enchantment.DURABILITY, 7)));
    }

    private void registerSword(Material type, String component, String itemnames, ItemStack item, List<Pair<Enchantment, Integer>> enchantments) {
        SlimefunItemStack is = new SlimefunItemStack(component + "_SWORD", type, "&r" + ChatUtils.humanize(itemnames) + "劍");

        for (Pair<Enchantment, Integer> enchantment : enchantments) {
            is.addUnsafeEnchantment(enchantment.getFirstValue(), enchantment.getSecondValue());
        }

        SlimefunItem slimefunItem = new SlimefunItem(category, is, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] { null, item, null, null, item, null, null, new ItemStack(Material.STICK), null });
        slimefunItem.register(this);

        researchId++;

        Research research = new Research(new NamespacedKey(this, component.toLowerCase() + "_sword"), researchId, ChatUtils.humanize(itemnames) + "劍", 3);
        research.addItems(slimefunItem);
        research.register();
    }

    private void registerArmor(ArmorSet armorset, String component, String itemnames, ItemStack item, List<Pair<Enchantment, Integer>> enchantments) {
        String humanizeditemnames = ChatUtils.humanize(itemnames);
        SlimefunItemStack[] armor = { new SlimefunItemStack(component + "_HELMET", armorset.getHelmet(), "&f" + humanizeditemnames + "頭盔"),
                new SlimefunItemStack(component + "_CHESTPLATE", armorset.getChestplate(), "&f" + humanizeditemnames + "胸甲"),
                new SlimefunItemStack(component + "_LEGGINGS", armorset.getLeggings(), "&f" + humanizeditemnames + "護腿"),
                new SlimefunItemStack(component + "_BOOTS", armorset.getBoots(), "&f" + humanizeditemnames + "靴子") };

        for (Pair<Enchantment, Integer> enchantment : enchantments) {
            for (ItemStack is : armor) {
                is.addUnsafeEnchantment(enchantment.getFirstValue(), enchantment.getSecondValue());
            }
        }

        SlimefunItem helmet = new SlimefunItem(category, armor[0], RecipeType.ARMOR_FORGE, new ItemStack[] { item, item, item, item, null, item, null, null, null });
        helmet.register(this);

        SlimefunItem chestplate = new SlimefunItem(category, armor[1], RecipeType.ARMOR_FORGE, new ItemStack[] { item, null, item, item, item, item, item, item, item });
        chestplate.register(this);

        SlimefunItem leggings = new SlimefunItem(category, armor[2], RecipeType.ARMOR_FORGE, new ItemStack[] { item, item, item, item, null, item, item, null, item });
        leggings.register(this);

        SlimefunItem boots = new SlimefunItem(category, armor[3], RecipeType.ARMOR_FORGE, new ItemStack[] { null, null, null, item, null, item, item, null, item });
        boots.register(this);

        researchId++;

        Research research = new Research(new NamespacedKey(this, component.toLowerCase() + "_armor"), researchId, humanizeditemnames + "盔甲", 5);
        research.addItems(helmet, chestplate, leggings, boots);
        research.register();
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/xMikux/ExtraGear/issues";
    }

}
