package tk.zeitheron.botanicadds.init;

import com.zeitheron.hammercore.internal.SimpleRegistration;
import com.zeitheron.hammercore.utils.recipes.helper.RecipeRegistry;
import com.zeitheron.hammercore.utils.recipes.helper.RegisterRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import tk.zeitheron.botanicadds.InfoBA;
import tk.zeitheron.botanicadds.recipes.RecipeLinkTesseract;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.recipe.RecipePureDaisy;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.lib.LibOreDict;

@RegisterRecipes(modid = InfoBA.MOD_ID)
public class RecipesBA
		extends RecipeRegistry
{
	
	public static final ResourceLocation elven_altar = new ResourceLocation(InfoBA.MOD_ID, "elven_altar");
	public static final ResourceLocation dreaming_pool = new ResourceLocation(InfoBA.MOD_ID, "dreaming_pool");
	public static final ResourceLocation terra_protector = new ResourceLocation(InfoBA.MOD_ID, "terra_protector");
	public static RecipePureDaisy dreamwood;

	@Override
	public void crafting()
	{
		ModContainer prev = Loader.instance().activeModContainer();
		Loader.instance().setActiveModContainer(getOwner());

		recipe(new RecipeLinkTesseract().setRegistryName("mana_tesseract_bind"));
		recipe(SimpleRegistration.parseShapedRecipe(new ItemStack(BlocksBA.ELVEN_ALTAR), "ddd", "dsd", "dad", 'd', new ItemStack(BlocksBA.DREAMROCK), 's', LibOreDict.DRAGONSTONE, 'a', new ItemStack(ModBlocks.runeAltar)).setRegistryName(elven_altar));
		recipe(SimpleRegistration.parseShapedRecipe(new ItemStack(BlocksBA.DREAMING_POOL), "ddd", "dpd", "ttt", 'd', new ItemStack(BlocksBA.DREAMROCK), 'p', new ItemStack(ModBlocks.pool), 't', LibOreDict.TERRASTEEL_NUGGET).setRegistryName(dreaming_pool));
		recipe(SimpleRegistration.parseShapedRecipe(new ItemStack(ItemsBA.TERRA_PROTECTOR), "ggg", "tst", " t ", 'g', LibOreDict.GAIA_INGOT, 't', LibOreDict.TERRASTEEL_NUGGET, 's', LibOreDict.RUNE[4]).setRegistryName(terra_protector));
		
		Loader.instance().setActiveModContainer(prev);
	}

	public static void init()
	{
		dreamwood = BotaniaAPI.registerPureDaisyRecipe("logElvenwood", ModBlocks.dreamwood.getDefaultState());
	}
}