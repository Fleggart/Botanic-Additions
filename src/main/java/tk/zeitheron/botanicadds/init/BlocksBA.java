package tk.zeitheron.botanicadds.init;

import tk.zeitheron.botanicadds.blocks.*;
import vazkii.botania.common.lexicon.LexiconData;

public class BlocksBA
{
	public static final BlockManaTesseract MANA_TESSERACT = new BlockManaTesseract();
	public static final BlockDummy DREAMROCK = new BlockDummy("dreamrock").setLexiconEntry(() -> LexiconData.elvenResources);
	public static final BlockElvenAltar ELVEN_ALTAR = new BlockElvenAltar();
	public static final BlockDreamingPool DREAMING_POOL = new BlockDreamingPool();
}