## ScalaFastFibonacci
This is a scala implementation of various fibonacci algorithms.

It includes a LargeInt wrapper (replacement for BigInt), using the JScience math library. This gave a bit of a performance increase over BigInt.

Run output:

```
[info] Running scala.fastfibonacci.FastFibonacci 
fib(2):  in: 21ms
fast(2):  in: 0ms
slow(2):  in: 0ms
fibIt(2):  in: 0ms
fib(4):  in: 0ms
fast(4):  in: 1ms
slow(4):  in: 0ms
fibIt(4):  in: 0ms
fib(8):  in: 0ms
fast(8):  in: 0ms
slow(8):  in: 1ms
fibIt(8):  in: 0ms
fib(16):  in: 0ms
fast(16):  in: 1ms
slow(16):  in: 14ms
fibIt(16):  in: 0ms
fib(32):  in: 1ms
fast(32):  in: 0ms
slow(32):  in: 1155ms
fibIt(32):  in: 0ms
fib(64):  in: 1ms
fast(64):  in: 0ms
fibIt(64):  in: 0ms
fib(128):  in: 0ms
fast(128):  in: 0ms
fibIt(128):  in: 1ms
fib(256):  in: 0ms
fast(256):  in: 0ms
fibIt(256):  in: 0ms
fib(512):  in: 1ms
fast(512):  in: 0ms
fibIt(512):  in: 0ms
fib(1024):  in: 0ms
fast(1024):  in: 1ms
fibIt(1024):  in: 0ms
fib(2048):  in: 1ms
fast(2048):  in: 10ms
fibIt(2048):  in: 1ms
fib(4096):  in: 0ms
fast(4096):  in: 3ms
fibIt(4096):  in: 3ms
fib(8192):  in: 4ms
fast(8192):  in: 11ms
fibIt(8192):  in: 15ms
fib(16384):  in: 9ms
fast(16384):  in: 11ms
fibIt(16384):  in: 16ms
fib(32768):  in: 6ms
fast(32768):  in: 25ms
fibIt(32768):  in: 49ms
fib(65536):  in: 15ms
fast(65536):  in: 59ms
fibIt(65536):  in: 114ms
fib(131072):  in: 7ms
fast(131072):  in: 42ms
fibIt(131072):  in: 417ms
fib(262144):  in: 19ms
fast(262144):  in: 90ms
fibIt(262144):  in: 1668ms
fib(524288):  in: 41ms
fast(524288):  in: 243ms
fibIt(524288):  in: 6948ms
fib(1048576):  in: 115ms
fast(1048576):  in: 603ms
fib(2097152):  in: 349ms
fast(2097152):  in: 1979ms
fib(4194304):  in: 1105ms
fast(4194304):  in: 6220ms
fib(8388608):  in: 3629ms
fast(8388608):  in: 20382ms
fib(16777216):  in: 11508ms
fast(16777216):  in: 63478ms
fib(33554432):  in: 33434ms
fast(33554432):  in: 186969ms
fib(67108864):  in: 101806ms
fast(67108864):  in: 553895ms
```

## License LGPL
Copyright 2012 Wes Freeman

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.
 
You should have received a copy of the GNU Lesser General Public License
along with this program.  If not, see http://www.gnu.org/licenses/
