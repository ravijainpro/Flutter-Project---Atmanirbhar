import 'dart:ffi';


class MealsListData {
  MealsListData({
    this.imagePath = '',
    this.titleTxt = '',
    this.startColor = '',
    this.endColor = '',
    this.meals = '',
    this.func = ''
  });

  String imagePath;
  String titleTxt;
  String startColor;
  String endColor;
  String meals;
  String func;
//  Map<String, Function> funcHandler = {}

  static List<MealsListData> tabIconsList = <MealsListData>[
    MealsListData(
      imagePath: 'assets/fitness_app/breakfast.png',
      titleTxt: 'Document',
      func : "startDocumentScanning()",
      meals: "Scan an image",
      startColor: '#FA7D82',
      endColor: '#FFB295',
    ),
    MealsListData(
      imagePath: 'assets/fitness_app/lunch.png',
      titleTxt: 'Barcode',

      meals:"Scan any Barcode",
      startColor: '#738AE6',
      endColor: '#5C5EDD',
    ),
    MealsListData(
      imagePath: 'assets/fitness_app/snack.png',
      titleTxt: 'QR Code',

      meals: "Scan a QR Code",
      startColor: '#FE95B6',
      endColor: '#FF5287',
    ),
    MealsListData(
      imagePath: 'assets/fitness_app/dinner.png',
      titleTxt: 'MRC',

      meals: "Scan a MRCode",
      startColor: '#6F72CA',
      endColor: '#1E1466',
    ),
  ];
}
