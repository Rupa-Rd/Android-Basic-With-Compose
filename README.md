# Android JetPack Compose Cheat Sheet

### Lifecycle
Enter Composition -> Recompose 0 or more times -> Leave the composition

### Composable Function
```
@Composable
fun MyFirstText(name: String){
  Text(text="Hello $name!")
}
```
Constraint for defining a composable function:
- Should have the @Composable Tag
- The function name must starts with UpperCase letter

Key Points:
- Composable functions can execute in any order
- Composable functions can execute in parallel
- Recomposition skips as many composable functions and lambdas as possible
- Recomposition is optimistic and maybe cancelled
- A composable function might run quite frequently, as often as every frame of an animations

### Composable Preview function
```
@Composable
@Preview
fun MyFirstTextPreview(){
  MyFirstText("Rupa-Rd")
}
```
Important use:
- Used to preview the UI of composable function

### Activity Function
```
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstText("Abc")
        }
    }
}
```
Important Points:
- It is an entry point to the composable function

### Recomposition
```
@Composable
fun MyComposable(){
  //Recomposition
  var myValue by remember {mutableStateOf(false)}
  Button(onClick = {myValue = !myValue}){
    Text(text= "$myValue")
  }
}
```
Important Points:
- Recomposition is used to update the composable function according to the change in data
- It uses `remember` function to update the value of data

### Intelligent Recomposition

Important Points:
- 
