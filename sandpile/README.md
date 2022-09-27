<style>

  table {
        table-layout: fixed;
        width: 100%;
    }

table:nth-of-type(1) {
    display:table;
    width:100%;
}
</style>

## SANDPILE KATA

Le but de l'exercice est de simuler le comportement d'une pile de sable soummise aux contraitres suivantes :

- Le sable s'écoule au milieu de la grille, grain par grain
- Une pile de sable s'effondre dès lors qu'elle cumule le nombre de 4 grains de sable.
- Une pile de sable se vide dans les tuiles adjacentes par un coté.

La grille est non null, de taille finie et connue

### exemple n°1 :

<table>
<tr>
    <th> Etape 1 </th>
    <th> Etape 2 </th>
    <th> Etape 3 </th>
</tr>

<tr><td>

|   1   |   0   |   2   |
|:-----:|:-----:|:-----:|
|   2   |   3   |   1   |
|   1   |   2   |   1   |

</td><td>

|   1   |   0   |   2   |
|:-----:|:-----:|:-----:|
|   2   | 3 + 1 |   1   |
|   1   |   2   |   1   |

</td>

<td>

|  1  |  1  |  2  |
|:---:|:---:|:---:|
|  3  |  0  |  2  |
|  1  |  3  |  1  |

</td>
</tr> </table>