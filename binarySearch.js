function binarySearch(array, numind) {
    let inizio = 0
    let fine = array.length - 1
    for (; inizio <= fine;) {
        let centro = Math.floor((inizio + fine) / 2)
        if (array[centro] == numind) {
            return centro
        }
        if (numind > array[centro]) {
            inizio = centro + 1
        }
        if (numind < array[centro]) {
            fine = centro - 1
        }
    }
    return -1
}

function main() {
    let array = [2, 5, 8, 34, 67, 99]
    let numind = 6
    let risultato = binarySearch(array, numind)
    if (risultato == -1) {
        console.log("Il numero non esite all'interno del'array")
    } else {
        console.log("Il numero esiste allinterno dell'array alla posizione: " + risultato)
    }
}

main()