package hagai.edu.mysafari;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hagai Zamir on 11-Jul-17.
 */

public class AnimalDataSource {
    public  static List<AnimalItem> getAnimals () {
        ArrayList<AnimalItem> animals = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            animals.add(new AnimalItem("Predators", "White Lion", R.drawable.white_lion_side ,"The white lion is a rare color mutation of the lion. Up until 2009, when the first pride of white lions was reintroduced to the wild, it was widely believed that the white lion could not survive in the wild. It is for this reason that a large part of the population of white lions now reside in zoos.[1]\n" +
                    "White lions in the area of Timbavati is the same subspecies as the tawny Southeast African lion (Panthera leo krugeri) found in some wildlife reserves in South Africa, and in zoological parks around the world. They were thought to have been indigenous to the Timbavati region of South Africa for centuries, although the earliest recorded sighting in this region was in 1938. Regarded as divine by locals, white lions first came to public attention in the 1970s, in Chris McBride's book The White Lions of Timbavati.[1]\n" +
                    "White lions of Mazanie are not albinos. Their white color is caused by a recessive trait derived from a less-severe mutation in the same gene that causes albinism, distinct from the gene responsible for white tigers. They vary from blonde to near-white. This coloration does not appear to disadvantage their survival. The white lions of the Global White Lion Protection Trust (GWLPT) have been reintroduced into their natural habitat and have been hunting and breeding successfully without human intervention for a significant amount of time." ));

            animals.add(new AnimalItem("Predators" , "Tiger" , R.drawable.white_lion_front , "The tiger (Panthera tigris) is the largest cat species, most recognizable for their pattern of dark vertical stripes on reddish-orange fur with a lighter underside.\n" +
                    "The species is classified in the genus Panthera with the lion, leopard, jaguar, and snow leopard. Tigers are apex predators, primarily preying on ungulates such as deer and bovids. They are territorial and generally solitary but social animals, often requiring large contiguous areas of habitat that support their prey requirements. This, coupled with the fact that they are indigenous to some of the more densely populated places on Earth, has caused significant conflicts with humans.\n" +
                    "Tigers once ranged widely across eastern Eurasia, from the Black Sea in the west, to the Indian Ocean in the south, and from Kolyma to Sumatra in the east. Over the past 100 years, they have lost 93% of their historic range, and have been extirpated from Western and Central Asia, from the islands of Java and Bali, and from large areas of Southeast, Southern, and Eastern Asia. Today, they range from the Siberian taiga to open grasslands and tropical mangrove swamps. The remaining six tiger subspecies have been classified as endangered by the International Union for Conservation of Nature (IUCN). The global population in the wild is estimated to number between 3,062 and 3,948 individuals, down from around 100,000 at the start of the 20th century, with most remaining populations occurring in small pockets isolated from each other, of which about 2,000 exist on the Indian subcontinent.[4] A 2016 global census estimated the population of wild tigers at approximately 3,890 individuals.[5][6] Major reasons for population decline include habitat destruction, habitat fragmentation and poaching. The extent of area occupied by tigers is estimated at less than 1,184,911 km2 (457,497 sq mi), a 41% decline from the area estimated in the mid-1990s. In 2016, wildlife conservation group at WWF declared that world's count of wild tigers has risen for the first time in a century "));

        }


        return animals;

    }
}
