package tk.zeitheron.botanicadds.init;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.recipe.RecipeManaInfusion;
import vazkii.botania.common.item.ModItems;

public class PoolRecipesBA
{
	
	public static final NonNullList<RecipeManaInfusion> mana_lapis = NonNullList.withSize(2, new RecipeManaInfusion(ItemStack.EMPTY, ItemStack.EMPTY, 0));
	
	public static void init()
	{
	
	}
	
}