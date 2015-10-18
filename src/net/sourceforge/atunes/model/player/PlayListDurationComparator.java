/**
 * aTunes 1.6.0
 * Copyright (C) 2006-2015 Adam Howard & Thomas Goodwin (AHoward101 tag140430) 
 *
 * http://www.atunes.org
 * http://sourceforge.net/projects/atunes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package net.sourceforge.atunes.model.player;

import java.util.Comparator;
import java.lang.Long;

import net.sourceforge.atunes.kernel.modules.repository.audio.AudioFile;


public class PlayListDurationComparator implements Comparator {

	public static PlayListDurationComparator comparator = new PlayListDurationComparator();
	
	public int compare(Object o1, Object o2) {
		AudioFile f1 = (AudioFile) o1;
		AudioFile f2 = (AudioFile) o2;
		Long l1 = f1.getDuration();
		Long l2 = f2.getDuration();
		return (int) l1.compareTo(l2);
	}

}
