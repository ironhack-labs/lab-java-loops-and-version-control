IntArrayList vs IntVector Efficiency
IntArrayList (50% Growth)
Default capacity: 10
Growth strategy: Increases by 50% when full (10 → 15 → 22 → 33...)
When IntArrayList is more efficient:

Memory usage matters - It uses less extra memory since it grows by only 50%
Adding elements slowly - When you add elements gradually over time, less wasted space
Limited memory available - In systems where memory is constrained
Few resizing operations needed - If you know the final size will be close to initial capacity

Example: Adding 100 numbers to a list where you don't need to resize many times
IntVector (100% Growth - Doubling)
Default capacity: 20
Growth strategy: Doubles when full (20 → 40 → 80 → 160...)
When IntVector is more efficient:

Adding elements rapidly - Fewer resizing operations needed
Performance is critical - Doubling reduces number of array copies
Unknown final size - Better for situations where size grows unpredictably
Speed over memory - Trade memory for faster add operations

Example: Adding 1000+ numbers quickly where performance matters more than memory