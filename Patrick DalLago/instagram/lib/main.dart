import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: .fromSeed(seedColor: Colors.deepPurple),
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        crossAxisAlignment: CrossAxisAlignment.center,
        children: [
          SizedBox(height: 200,),
          Image.asset('images/logo.png'),
          SizedBox(height: 52,),
          Column(
            children: [
              Container(

                height: 100,
                width: 100,
                decoration: BoxDecoration(
                  image: DecorationImage(
                    fit: .cover,
                    image: NetworkImage('https://th.bing.com/th/id/OIP.5qSmhXAPzpRf_txZO4l9LAHaE8?r=0&o=7rm=3&rs=1&pid=ImgDetMain&o=7&rm=3' )
                  ),
                  shape: BoxShape.circle
                ),
              ),
              SizedBox(height: 13, ),
              Text("Jacob_w")
            ],
          ),
          SizedBox(height: 12,),
          FilledButton(onPressed: ()=>{}, child: Text("Log in", style: TextStyle(
            color: Colors.white
          ),), style: ElevatedButton.styleFrom(
            backgroundColor: Color(0xFF3797EF),
            fixedSize: Size(307, 44),
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadiusGeometry.circular(5)
            )
          )
          ),
          SizedBox(height: 30,),
          GestureDetector(
            child: Text("Switch accounts", style: TextStyle(
                color: Color(0xFF3797EF)
            )),
          ),
          SizedBox(height: 169,),
          Divider(),
          SizedBox(height: 18,),
          Row(
            mainAxisAlignment: .center,
            crossAxisAlignment: .center,
            children: [
              Text("Don’t have an account? ", style: TextStyle(
                  color: Color(0xFFC3C3C3)
              )),
              GestureDetector(
                child: Text("Sign up", style: TextStyle(
                    fontWeight: .bold
                ),),
              )
            ],
          )
        ],
      ),


    );
  }
}
