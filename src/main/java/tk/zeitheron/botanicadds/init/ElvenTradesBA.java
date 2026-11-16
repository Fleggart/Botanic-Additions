package tk.zeitheron.botanicadds.init;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.recipe.RecipeElvenTrade;
import vazkii.botania.common.lib.LibOreDict;

public class ElvenTradesBA
{
	public static RecipeElvenTrade dreamrock;
	
	public static void init()
	{
		dreamrock = BotaniaAPI.registerElvenTradeRecipe(new ItemStack(BlocksBA.DREAMROCK), LibOreDict.LIVING_ROCK);
	}
}