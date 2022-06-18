function walking(steps, footprint, speed){
let distanceInMeters = steps * footprint;
let speedMeterSec = speed / 3.6;
let timeSec = distanceInMeters / speedMeterSec;
let rest = Math.floor(distanceInMeters / 500);

let totalTimeMin = Math.floor(timeSec / 60);
let totalTimeSec = Math.round(timeSec - totalTimeMin * 60);
let totalTimeHrs = Math.floor(timeSec / 3600);

console.log((totalTimeHrs < 10 ? "0" : "") + totalTimeHrs + ":" +
 (totalTimeMin + rest < 10 ? "0" : "") + (totalTimeMin + rest) + ":" +
 (totalTimeSec < 10 ? "0" : "") + totalTimeSec);
}

walking(4000, 0.60, 5);
walking(2564, 0.70, 5.5);