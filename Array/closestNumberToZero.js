nums = [2,-1,1];

let closest = nums[0];

for (let i = 1; i < nums.length; i++) {
  if (Math.abs(closest) > Math.abs(nums[i])) {
    closest = nums[i];
  } else {
    if (closest < 0 && nums.includes(Math.abs(closest))) {
        return Math.abs(closest)
    } else {
        return closest
    }
  }
}

console.log(closest);
