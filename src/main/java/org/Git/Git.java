package org.Git;

public class Git {
    /*
        crea un repositorio nuevo	->	sudo git init

        ADD & COMMIT
        ------------
        Registrar cambios	->	sudo git add .
					            sudo git add [filename]


        Commit a estos cambios	->	sudo git commit -a
                                    sudo git commit -m "Commit message"

        Comprobar estado		->	sudo git status


        ENVIO DE CAMBIOS (SUBIR)
        ----------------
        Tus cambios están ahora en el HEAD de tu copia local.
        Para enviar estos cambios a tu repositorio remoto.

            sudo git push origin [master | rama ]


        RAMAS
        -----
        Nueva rama			->	sudo git branch [rama]
        Ver ramas				->	sudo git branch
        Cambiar de rama		->	sudo git checkout [rama]
        Crear y cambiar		->	sudo git checkout -b [rama]
        Volver a rama principal 	-> 	sudo git checkout master
        Subir rama			->	sudo git push origin [rama]
        Borrar rama			->	sudo git branch -d [rama]

        *Las ramas nuevas no estarán disponibles a menos que hagas push

            sudo git push origin <branch>


        ACTUALIZA & FUSIONA
        -------------------
        Actualizar local al commit más nuevo de git		->	sudo git pull
        Fusionar una rama a la rama master				->	sudo git merge <branch>
        Bajar cambios y fusionar manualmente			->	sudo git fetch

        *El merge fusiona una rama con la rama destino, la destino será en la que nos
        encontremos en ese momento


        ETIQUETAS
        ---------
        Ver etiquetas		->		sudo git tag
        Crear etiqueta		->		sudo git tag [nombre etiqueta] | [id commit]
        (Si es a un commit anterior)

        Crear con anotacion	->		sudo git tag -a [nombre etiqueta] -m "mensaje"
        ID commit			->		sudo git log
        Subir etiqueta		->		sudo git push origin [nombre etiqueta]
        Subir todas		->		sudo git push origin --tags
        Eliminar			->		sudo git tag -d [nombre etiqueta]


        DESHACER
        -------
        Deshacer todos los cambios locales y commits, bajar ultima versión del servidor

            sudo git fetch origin
            sudo git reset --hard origin/master



       CAMBIAR REPOSITORIO
        -------------------
        git remote set-url origin https://gitlab.com/otro_usuario/otro_repositorio.git



        CONFIGURAR
        ----------
        git config --list

        git config --global user.name "John Doe"
        git config --global user.email "johndoe@example.com"


        *Si hay problemas de permisos eliminar credencial en windows (Administrador de credenciales)
     */
}
