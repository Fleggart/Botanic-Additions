package tk.zeitheron.botanicadds.init;

import tk.zeitheron.botanicadds.api.GaiaPlateRecipes;

import net.minecraft.item.ItemStack;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.lib.LibOreDict;

public class GaiaPlateRecipesBA
{
	public static GaiaPlateRecipes.RecipeGaiaPlate TERRA_STEEL;
	
	
	public static void init()
	{
		TERRA_STEEL = GaiaPlateRecipes.registerGaiaPlateRecipe(new ItemStack(ModItems.manaResource, 1, 4), 300_000, LibOreDict.MANA_DIAMOND, LibOreDict.MANA_PEARL, LibOreDict.MANA_STEEL);
	}
}