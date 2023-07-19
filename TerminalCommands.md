## Задание 1

cat > pets

1 dog Alma 19.06.2020

2 cat Leya 22.10.2021

3 hamster Yasha 11.06.2022

cat > pack_animals

4 horse Lili 05.12.2015

5 camel John 01.01.2018

6 donkey Ia 18.04.2023

cat pets

1 dog Alma 19.06.2020

2 cat Leya 22.10.2021

3 hamster Yasha 11.06.2022

cat pack_animals

4 horse Lili 05.12.2015

5 camel John 01.01.2018

6 donkey Ia 18.04.2023

cat pets pack_animals > final

cat final

1 dog Alma 19.06.2020

2 cat Leya 22.10.2021

3 hamster Yasha 11.06.2022

4 horse Lili 05.12.2015

5 camel John 01.01.2018

6 donkey Ia 18.04.2023

mv final mans_friends

cat mans_friends

1 dog Alma 19.06.2020

2 cat Leya 22.10.2021

3 hamster Yasha 11.06.2022

4 horse Lili 05.12.2015

5 camel John 01.01.2018

6 donkey Ia 18.04.2023


## Задание 2

mkdir animals
mv mans_friends animals/
ll animals/

## Задание 3

sudo wget  https://dev.mysql.com/get/mysql-apt-config_0.8.25-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.25-1_all.deb
sudo apt-get update
sudo apt-get install mysql-shell

## Задание 4

sudo wget http://archive.ubuntu.com/ubuntu/pool/universe/s/smlnj/nowhere_110.79-6_amd64.deb
sudo dpkg -i nowhere_110.79-6_amd64.deb
sudo dpkg -r nowhere






