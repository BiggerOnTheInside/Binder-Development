/***************************************************************************************************/
/** Copyright 2015 BiggerOnTheInside (development), all rights reserved.                           */
/** Released under the Binder License (https://github.com/BiggerOnTheInside/Licenses/Binder.txt)   */
/***************************************************************************************************/

package net.BiggerOnTheInside.Binder;

public class BlockAir extends Block{

	@Override
	public byte getID() {
		return 0;
	}

	@Override
	public BlockTextureCoordinate getTextureCoordinates() {
		return new BlockTextureCoordinate(-1, -1);
	}

}
