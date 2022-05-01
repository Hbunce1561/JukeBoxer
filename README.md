# JukeBoxer
A simple app for playing songs

Usage: to make functional, there are two ways to add/modify tracks, the first is through this line: 

jukebox.addSong(new Track("What's Your Country Song", "Country Again", "Thomas", "Rhett", Genre.COUNTRY, 175000, "./Whatsyourcountrysong.mp3"));

The second is through these lines:

tunes.add(new Oldie("Tom Petty", "Free Fallin", "Full Moon Fever", "Classic Rock", 262000, "./FreeFallin.mp3"));

Both do similar things, track method needs the genre to be in the enumeration and seperates out first and last name in artist name, the tune method does not.

These both need to be pointed at the song file (ie "./song.mp3") to actually play the song.

Song length is a deprecated variable, no longer used in this version, however can be reimplemented with thread.sleep().
