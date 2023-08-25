
## User Paths

(GET) /users -> 
get all user

(GET) /users/user?id={id} -> 
get user by id 

(POST) /users ->
create new user with request body

(PUT) /users -> 
update by user id with request body

(DELETE) /users/user?id={id} ->
delete user by user id

## List Title Paths

(GET) /listtitles ->
get all list titles

(GET) /listtitles/listtitle?id={id} ->
get list title by id

(POST) /listtitles ->
create new list title with request body

(PUT) /listtitles ->
update by list title id with request body

(DELETE) /listtitles/listtitle?id={id} ->
delete list title by list title id

(GET) //listtitles/{id} ->
get list title by user id with path variable

## List Paths

(GET) /lists ->
get all list
 
(GET) /lists/list?id={id} ->
get list by id

(POST) /lists ->
create new list with request body

(PUT) /lists ->
update by list id with request body

(DELETE) /lists/lists?id={id} ->
delete list title by list title id

(GET) //lists/{id} ->
get list by list title id with path variable
