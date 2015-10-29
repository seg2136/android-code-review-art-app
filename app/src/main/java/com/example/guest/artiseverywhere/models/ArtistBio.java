package com.example.guest.artiseverywhere.models;

import com.example.guest.artiseverywhere.R;

import java.util.ArrayList;

/**
 * Created by Guest on 10/28/15.
 */
public class ArtistBio {

    private ArrayList<Artist> mArtists;

    public ArtistBio() {
        setArtists();
    }

    public ArrayList<Artist> getArtists() {
        return mArtists;
    }

    private void setArtists() {
        mArtists = new ArrayList<>();

        mArtists.add(new Artist("Jeffrey Conley", "Jeffrey Conley lives with his wife and daughter in Corvallis, Oregon. His work has been exhibited at numerous galleries and museums worldwide and is in the permanent collections of the Santa Barbara Museum of Art, the Museum of Fine Art, Houston, Rochester Institute of Technology, the Museum of Art, Nanao, Japan and others. His first monograph, Winter, was published by Nazraeli Press in 2010.",
                                R.drawable.grasses_and_clouds
        ));

        mArtists.add(new Artist("Adam Sorensen", "New Paintings marks a progression in the artist’s steady evolution. Each new chapter further explores his visual language and pushes the elements until they reveal their inner workings. In one exhibition the branches emerge from the lake; in the next, they blossom. By simplifying the composition, controlling the palette and condensing the focus, Sorensen’s new works take on the guise of magnified miniatures. Intense detail is expanded and the artist hands us a key to his canvases. But, like an ever-expanding fractal, there is always something smaller lurking on the edge of these paintings. Horizons come into focus and the silver surfaces of Sorensen’s depths set our eyes reeling in a continuous journey inward.\"",
                                R.drawable.adam_image
        ));

        mArtists.add(new Artist("Therese Murdza", "Years spent in Rehoboth Beach DE, Brooklyn NY, Washington DC, Durham NC, and Grinnell IA, had me drawing on big paper and literally taking the words apart. Disintegrating the shapes of the words into lines, circles, squares and color. Hearing words, seeing music, somehow marking sound in charcoal, ink, pencil, and paint.\n" +
                "\n" +
                "Since 2000, I’ve worked almost exclusively on stretched canvas, in turns building large, sometimes multi-paneled works on canvas, and smaller works on canvas and paper. From my studio in Portland OR, I partner with gallerists, design professionals, art agents, and private clients to place my paintings nationwide.",
                R.drawable.murdza_therese
        ));

    }


    public Artist nextArtist(Artist currentArtist) {
        int index = mArtists.indexOf(currentArtist);
        if (index == mArtists.size() -1) {
            return mArtists.get(0);
        } else {
            return mArtists.get(index + 1);
        }
    }
}
