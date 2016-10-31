# Getting started with Play (Scala)

This project demonstrate how to create a simple CRUD application with Play.
# PlayDemo

<!-- @inputText(searchForm("contractEntity"),'_label -> "Contract Entity")(searchInputTextField1,
        implicitly[Messages])-->

 @select(searchForm("contractEntity"), options("CMM" -> "Caremark MCO", "EXM" ->"Express Scripts MCO","CIG" -> "Cigna MMA")
        '_default -> "--- Choose a Contract Entity ---",
        '_label -> "Contract Entity")

 @select(field = searchForm("contractEntity"),
        options = options("CMM" -> "Caremark MCO", "EXM" ->"Express Scripts MCO","CIG" -> "Cigna MMA"),
        args = '_label -> "Contract Entity"
        )

searchInputTextField.scala

@select( field = searchForm("contractEntity"),
        options = options( "" -> "Default", "brown" -> "brown", "black" -> "black", "blue" -> "Blue" ),
        args = '_label -> "Choose a eye color" )

UtilityHelper.contractEntityList

@(elements: views.html.helper.FieldElements,optionValues:Seq[(String,String)])
<div class="col-xs-1 col-md-2 text-md-right">
    <label class="form-label" for="@elements.field.id">@elements.label</label>
</div>
<div class="col-xs-2">
<select class="form-control" name="@elements.field.name">
    options = options(optionValues)
</select>
</div>
