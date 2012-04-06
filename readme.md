## ScalaEightQueens
This is a scala implementation of the Eight Queens algorithm.

Run output:

```
[info] Running scala.eightqueens.EightQueens 
List(5, 2, 8, 1, 4, 7, 3, 6)
 .  .  .  .  Q  .  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  .  .  Q 
 Q  .  .  .  .  .  .  . 
 .  .  .  Q  .  .  .  . 
 .  .  .  .  .  .  Q  . 
 .  .  Q  .  .  .  .  . 
 .  .  .  .  .  Q  .  . 

List(3, 7, 2, 8, 5, 1, 4, 6)
 .  .  Q  .  .  .  .  . 
 .  .  .  .  .  .  Q  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  .  .  Q 
 .  .  .  .  Q  .  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  .  Q  .  .  .  . 
 .  .  .  .  .  Q  .  . 

List(3, 5, 2, 8, 1, 7, 4, 6)
 .  .  Q  .  .  .  .  . 
 .  .  .  .  Q  .  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  .  .  Q 
 Q  .  .  .  .  .  .  . 
 .  .  .  .  .  .  Q  . 
 .  .  .  Q  .  .  .  . 
 .  .  .  .  .  Q  .  . 

List(6, 3, 5, 8, 1, 4, 2, 7)
 .  .  .  .  .  Q  .  . 
 .  .  Q  .  .  .  .  . 
 .  .  .  .  Q  .  .  . 
 .  .  .  .  .  .  .  Q 
 Q  .  .  .  .  .  .  . 
 .  .  .  Q  .  .  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  .  Q  . 

List(5, 8, 4, 1, 3, 6, 2, 7)
 .  .  .  .  Q  .  .  . 
 .  .  .  .  .  .  .  Q 
 .  .  .  Q  .  .  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  Q  .  .  .  .  . 
 .  .  .  .  .  Q  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  .  Q  . 

List(4, 2, 5, 8, 6, 1, 3, 7)
 .  .  .  Q  .  .  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  Q  .  .  . 
 .  .  .  .  .  .  .  Q 
 .  .  .  .  .  Q  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  Q  .  .  .  .  . 
 .  .  .  .  .  .  Q  . 

List(4, 6, 1, 5, 2, 8, 3, 7)
 .  .  .  Q  .  .  .  . 
 .  .  .  .  .  Q  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  .  .  Q  .  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  .  .  Q 
 .  .  Q  .  .  .  .  . 
 .  .  .  .  .  .  Q  . 

List(6, 3, 1, 8, 5, 2, 4, 7)
 .  .  .  .  .  Q  .  . 
 .  .  Q  .  .  .  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  .  .  .  .  .  Q 
 .  .  .  .  Q  .  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  Q  .  .  .  . 
 .  .  .  .  .  .  Q  . 

List(5, 3, 1, 6, 8, 2, 4, 7)
 .  .  .  .  Q  .  .  . 
 .  .  Q  .  .  .  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  .  .  .  Q  .  . 
 .  .  .  .  .  .  .  Q 
 .  Q  .  .  .  .  .  . 
 .  .  .  Q  .  .  .  . 
 .  .  .  .  .  .  Q  . 

List(4, 2, 8, 6, 1, 3, 5, 7)
 .  .  .  Q  .  .  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  .  .  Q 
 .  .  .  .  .  Q  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  Q  .  .  .  .  . 
 .  .  .  .  Q  .  .  . 
 .  .  .  .  .  .  Q  . 

List(4, 7, 5, 2, 6, 1, 3, 8)
 .  .  .  Q  .  .  .  . 
 .  .  .  .  .  .  Q  . 
 .  .  .  .  Q  .  .  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  Q  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  Q  .  .  .  .  . 
 .  .  .  .  .  .  .  Q 

List(5, 7, 2, 6, 3, 1, 4, 8)
 .  .  .  .  Q  .  .  . 
 .  .  .  .  .  .  Q  . 
 .  Q  .  .  .  .  .  . 
 .  .  .  .  .  Q  .  . 
 .  .  Q  .  .  .  .  . 
 Q  .  .  .  .  .  .  . 
 .  .  .  Q  .  .  .  . 
 .  .  .  .  .  .  .  Q 

found 92 distinct solutions
found 12 unique solutions
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
