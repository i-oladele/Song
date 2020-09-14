/*Metadata for "Look Up Child";
Assignment to explore the use of various data types in Kotlin*/

fun main(args: Array<String>) {

    //Title of the Song//
    val songTitle: String = "Look Up Child"

    //Name of performing artist who sang the song//
    val artistName: String = "Lauren Daigle"

    //Names of producers involved in the song production//
    val producer: String = "Jason Ingram, Paul Mabury"

    //Name of those involved in writing the song. Producers also get writing credit//
    val writer: String = "Lauren Daigle, Jason Ingram, Paul Mabury"

    //Year of Song release//
    val year: Int = 2019

    //Category/Tradition/Convention to which the song belongs//
    val genre: String = "Contemporary Christian Music"

    //Total time of the song//
    val trackDuration: String = "3:03"

    //Tempo/Rhythm of the song//
    val beatsPerMinute: Int = 91

    //Amazon customer review ratings for the song//
    val rating: Double = 4.8

    //United States gold certification for this song//
    val goldCertification: Boolean = true



    println("Song Title is $songTitle")
    println("Sang by $artistName")
    println("Produced by $producer")
    println("Written by $writer")
    println("Released in $year")
    println("Genre: $genre")
    println("Duration: $trackDuration")
    println("Beats per Minute: $beatsPerMinute")
    println("Rating: $rating")
    println("United state gold certification: $goldCertification")
}






