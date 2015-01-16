package net.BiggerOnTheInside.Binder;

import net.BiggerOnTheInside.Binder.BlockRenderer.BlockFace;

public class BlockAir extends Block {

	@Override
	public byte getID() {
		return 0;
	}


	@Override
	public BlockTextureCoordinates getTextureCoordinates(BlockFace showing) {
		return new BlockTextureCoordinates(-1f, -1f);
	}

}