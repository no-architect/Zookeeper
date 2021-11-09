class Box<T>(_furniture: T, _volume: Int){
    val furniture: T = _furniture
    val volume: Int = _volume
    fun getBoxVolume(): Int { return volume }
    fun getFurnitureFromBox(): T { return furniture }
}

//Don't change classes below
class Fridge{}
class Armchair{}
