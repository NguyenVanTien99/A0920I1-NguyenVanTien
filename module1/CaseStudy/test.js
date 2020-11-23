function timeConversion(s) {
    const arr = s.slice(0,8).split(':');
    // arr[0] = (s.indexOf('PM') > -1) ?
    //          (arr[0] == 12 ? '12' : Number(arr[0]) + 12) :
    //          (arr[0] == 12 ? '00' : arr[0]);
    // return arr.join(':');
    if((s.indexOf('PM') > -1)){
        if(arr[0] == 12){
            arr[0] = '12'
        }else{
            arr[0] = Number(arr[0]) + 12)
        }
    }else{
        if(arr[0] == 12){
            arr[0] = '00'
        }else{
            arr[0]=arr[0]
        }
    }
        return arr.join(':');
    }

