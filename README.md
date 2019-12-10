# movie-catalogue

**Egyszerű filmkatalógus, ahol a filmekhez rövid jellemzés érhető el. A felhasználók új filmeket adhatnak hozzá, értékelhetik a már feltöltötteket. A filmek között több szempont (cím, műfaj, színészek, rendező, értékelések) szerint lehet keresni.** 

## Funkcionális követelmények

### Bejelentkezett felhasználó

- Új színész/rendező/film létrehozása
- Filmek listázása, akár különbőző szempontok alapján rendezve
- Film jellemzőinek, és a vélemények olvasása
- Keresés a filmek között különböző szempontok szerint
- Film értékelése
- Publikus vélemény írása filmről
- Publikus/privát lista készítése megnézendő filmekről
  
### Vendég felhasználó

- Filmek listázása
- Film jellemzőinek, és a vélemények olvasása
- Keresés a filmek között különböző szempontok szerint
  
### Moderátor

- Ellenőrzi a felhasználók által feltöltött tartalmak hitelességét és, hogy nem sértik a szabályzatot
- Ellenőrzi, hogy a felhasználók által írt vélemények nem sértik a szabályzatot
- Eltávolítja a kifogásolhatónak ítélt tartalmatat.
  
### Adminisztrátor

- Moderátori feladatok ellátása
- Felhasználók listázása
- Felhasználóknak moderátori jog adása
- Felhasználóktól moderátori jog elvétele
  
## Nem funkcionális követelmények

- Felhasználóbarát, egyszerű, letisztult felület
- Keresési eredmények gyors megjelenítése
- Jelszavas azonosítás, jelszavak biztonságos tárolása

## Szakterületi fogalomjegyzék

- **katalógus:** Rendszerbe foglalt jegyzék, amely dolgokat rendezett egészbe foglal.

## Szerepkörök

- Bejelentkezett felhasználó
- Vendég felhasználó
- Moderátor
- Adminisztrátor

## Adatbázis terv

![adatbazis terv](https://github.com/szilagyizsofia/movie-catalogue/blob/master/Untitled.png)

## Könyvtárstruktúra

- controller
  - ActorController
  - DirectorController
  - MovieController
  - ReviewController
  - UserController
- model
  - Actor
  - BaseEntity
  - Director
  - Genre
  - Movie
  - Review
  - User
- repositories
  - ActorRepository
  - DirectorRepository
  - GenreRepository
  - MovieRepository
  - ReviewRepository
  - UserRepository
- service
  - MovieService
  - UserService
  
# Oldaltérkép
* Főoldal
* Filmek listázása
* Értékelések listázása
* Felhasználók listázása
* Bejelentkezés
* Kijelentkezés

# Végpontok
* `GET /` Főoldal
* `GET /login`  Bejelentkező oldal
* `POST /login` Bejelentkezés
* `GET /register` Regisztrációs oldal
* `POST /register` Regisztráció
* `GET /logout` Kijelentkezés
* `GET /user` Felhasználók listája
* `GET /movies` Filmek listája
* `GET /movies/search/:substr` Filmek keresése film cím részének alapján
* `GET /movies/genres/:genre` Filmek keresése típus alapján
* `GET /movies/actor/search/:name` Filmek keresése színész részneve alapján
* `GET /movies/director/search/:name` Filmek keresése rendező részneve alapján
* `GET /movies/:id` Film keresése id alapán
* `POST /movies/add` Film feltöltése 
* `DELETE /movies/id` Film törlése id alapán
* `GET /reviews` Értékelések listázása létrehozás alapján csökkenő sorrendben
* `GET /reviews/:id` Érrtékelés keresése id alapán
* `POST /reviews/add` Értékelés feltöltése 
* `DELETE /reviews/:id` Film törlése id alapán

# Egy végpont bemutatása

Regisztráció

![aszekvencia diagram](https://github.com/szilagyizsofia/movie-catalogue/blob/master/sequencediagram.png)

# Fejlesztőkörnyezet

## Felhasznált eszközök
* [Git](https://git-scm.com/) verziókezelő
* [Node.js](https://nodejs.org/en/) Javascript környezet
* [AngularJS](https://angular.io/) Javascript keretrendszer
* [Github](https://github.com/) projekt közzététele

## Fejlesztőkörnyezet felállítása
* Git verziókezelő telepítése
* Node.js telepítése
* Projekt klónozása git clone https://github.com/szilagyizsofia/movie-catalogue.git
* App indítása: npm start

## Telepítés és indítás

* **Telepítés**: Az [Implementációban](Implementáció#fejlesztőkörnyezet-felállítása) megadottak alapján
* **Futtatás**: `nmp start` paranccsal, majd `http://localhost:4200`
