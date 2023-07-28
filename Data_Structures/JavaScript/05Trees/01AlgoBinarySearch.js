function algobinarySearch(arr,target){
    let startIndex = 0;
    let endIndx =arr.length-1;
    let middleIndx 
    while(startIndex <= endIndx){
        middleIndx = Math.floor((startIndex + endIndx) / 2);

       if(arr[middleIndx] === target){
        return middleIndx;
       }else if( target > arr[middleIndx] ){
        startIndex =  middleIndx+1;

       }else {
        endIndx = middleIndx -1;
       }
    }
    return -1
}


let array = [1, 3, 5, 6, 13, 17];
console.log('hi hello')
 let result = algobinarySearch(array, 13);
 console.log(result)