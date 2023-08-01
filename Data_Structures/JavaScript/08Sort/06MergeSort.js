function mergeSort(array) {
    if (array.length <= 1) {
        return array;
    }
    const middleIdx = Math.floor(array.length / 2);
    const firstHalf = array.slice(0, middleIdx);
    const lastHalf = array.slice(middleIdx);

    return join(mergeSort(firstHalf), mergeSort(lastHalf));
}

function join(firstHalf, lastHalf) {
    const newArray = [];
    let i = 0;
    let j = 0;

    while (i < firstHalf.length && j < lastHalf.length) {
        if (firstHalf[i] < lastHalf[j]) {
            newArray.push(firstHalf[i]);
            i++;
        } else {
            newArray.push(lastHalf[j]);
            j++;
        }
    }

    while (i < firstHalf.length) {
        newArray.push(firstHalf[i]);
        i++;
    }

    while (j < lastHalf.length) {
        newArray.push(lastHalf[j]);
        j++;
    }

    return newArray;
}

const array = [6, 2, 8, 4, 5, 15];
const result = mergeSort(array);
console.log(array);
