import com.github.chrisroselle.ChoiceParam
import groovy.transform.Field

@Field example = new ChoiceParam()
example.name = 'example'
example.description = 'this is an example of a reusable parameter'
example.choices = ['one', 'two']
