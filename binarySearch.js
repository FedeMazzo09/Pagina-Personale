function binarySerach(array, numid) {
    let inizio = 0
    let fine = array.length - 1
    for (; inizio <= fine;) {
        let medio = Math.floor((inizio + fine) / 2)
        if (array[centro]==numind){
            return centro
        }
        if (numind > array[centro]){
            centro=centro+1
        }
    }
}