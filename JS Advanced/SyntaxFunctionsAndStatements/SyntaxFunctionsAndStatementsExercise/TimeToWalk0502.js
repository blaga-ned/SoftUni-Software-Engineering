function timeToWalk(steps, footprint, speedKmH){
    let speedMsec = speedKmH * 1000 / 3600;
    let distanceMetr = steps * footprint;

    let restTimeSec = Math.floor(distanceMetr / 500)*60;
    let time = distanceMetr/speedMsec + restTimeSec;

    let hours = Math.floor(time/3600).toFixed(0).padStart(2, "0");
    let minutes = Math.floor((time/60)).toFixed(0).padStart(2, "0");
    let seconds = (time%60).toFixed(0).padStart(2, "0");

    return `${hours}:${minutes}:${seconds}`;

}

console.log(timeToWalk(4000, 0.60, 5));
console.log(timeToWalk(2564, 0.70, 5.5));
