2(a)
for (x = 10; x > 0; x--) {
    sum += x;
}

2(b)
do {
    x += 2;
    y += x;

    System.out.println(x + " and " + y);

} while (x < 100);

2(c)
  for (x = 1, y = 20; x < y; x++, y -= 2) {

    System.out.println(x + " " + y);
}

2(d)
  i = 1;

while (i <= 10) {

    if (i == 10) {
        System.out.println("Program End");
    }

    i++;
}
